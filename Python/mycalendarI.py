

class MyCalendar:
    
    times = []

    def __init__(self):
        pass
        

    def book(self, start: int, end: int) -> bool:
        
        for time in self.times:
            if start < time[1] and time[0] < end:
                return False

        self.times.append([start, end])
        return True