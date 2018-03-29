package Leetcode.code_057_Insert_Interval;

import java.util.List;

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}
public class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        int i=0;
        while(i<intervals.size() && intervals.get(i).end<newInterval.start) i++;//定位跨越几个区间
        while(i<intervals.size() && intervals.get(i).start<=newInterval.end){
            newInterval = new Interval(Math.min(intervals.get(i).start, newInterval.start), Math.max(intervals.get(i).end, newInterval.end));
            intervals.remove(i); //把跨越区间内的间隔全部去掉
        }
        //是定位的到的间隔
        intervals.add(i,newInterval);
        return intervals;
    }
}
