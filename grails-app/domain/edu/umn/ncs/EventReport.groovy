package edu.umn.ncs

class EventReport {
	
	Person person

	EventSource eventSource
	String eventSourceOther
	Date contactDate
	String filledOutBy
	Date filledOutDate
	String comments
	
	static hasMany = [ studies: Study, events: EventOfInterest ]
	

    static constraints = {
		person()
		eventSource()
		eventSourceOther(nullable:true)
		contactDate()
		filledOutBy()
		filledOutDate()
		comments(nullable:true)
    }
}
