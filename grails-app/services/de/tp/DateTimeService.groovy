package de.tp

class DateTimeService {
	
	def splitToWeekMap(days) {
		
		def resultMap = [:]
		
		if (days) {
			long currentWeek = days[0].date?.format('w') as long
			days.each {
				if (!resultMap.containsKey(currentWeek)) resultMap[(currentWeek)] = []
							
				resultMap[(currentWeek)] << it
				
				def cal = it.date.toCalendar()
				cal.add(Calendar.DATE, 1)
				def nextDayOfWeek = cal.get(Calendar.DAY_OF_WEEK)
				
				if (nextDayOfWeek == cal.getFirstDayOfWeek()) currentWeek++
			}
		}
		
		return resultMap
	}
}