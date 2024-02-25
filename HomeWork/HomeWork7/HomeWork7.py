def minMeetingRooms(intervals):
    meeting_map = {}
    
    for interval in intervals:
        start, end = interval
        
        for minute in range(start, end):
            meeting_map[minute] = meeting_map.get(minute, 0) + 1
    
    return max(meeting_map.values())

if __name__ == "__main__":
    intervals = [[0, 30], [5, 10], [15, 20]]
    print(minMeetingRooms(intervals))
