package Leetcode.code_056_Merge_Intervals;

import java.util.ArrayList;
import java.util.List;

class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
 }
public class Solution {

    public List<Interval> merge(List<Interval> intervals) {

        if(intervals == null ) return intervals;

        intervals.sort((i1,i2)->Integer.compare(i1.start,i2.start));  //java1.8

        List<Interval> list = new ArrayList<Interval>();  //返回结果的集合

        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for(Interval interval : intervals){
            if(interval.start<=end)    //当前的start小于上一轮迭代的end,说明有交叉
                end = Math.max(end,interval.end);
            else{
                list.add(new Interval(start,end));  //把上轮的start和end加入集合，并修改start和end
                start = interval.start;
                end = interval.end;

            }

        }
        // Add the last interval
        list.add(new Interval(start, end));
        return list;
    }
}
