package edu.umn.ncs

class EventOfInterest {
	
	EventType eventType
	BigDecimal eventCode
	EventPickOne eventPickOne	
	Date eventDate
	String datePrecision
	String eventDescription
	
	Date userCreated
	Date dateCreated
	
	EventResult eventResult
	Date eventResultDate
	String userResultEntered
	Date dateResultEntered
	
	static belongsTo = [ eventReport: EventReport ]
	
    static constraints = {
		eventType()
		eventDescription(nullable:true)
		eventCode(nullable:true)
		eventPickOne(nullable:true)
		eventDate(nullable:true)
		datePrecision(nullable:true)
		userCreated(nullable:true)
		dateCreated()
		eventResult(nullable:true)
		eventResultDate(nullable:true)
		userResultEntered(nullable:true)
		dateResultEntered(nullable:true)
    }
}
