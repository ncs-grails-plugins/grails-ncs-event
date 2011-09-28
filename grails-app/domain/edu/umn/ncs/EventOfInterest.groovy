package edu.umn.ncs

class EventOfInterest {
	
	// The type of event reported
	EventType eventType
	// Any codes associated with the even (number)
	BigDecimal eventCode
	// Any type of pull-down value associated with the event
	EventPickOne eventPickOne
	// Any date associated with the event
	Date eventDate
	// The precision of the date (day, month, year)
	String datePrecision
	// Any textual description of the event
	String eventDescription
	
	// date the record was entered
	Date dateCreated = new Date()
	// user who entered the record
	String userCreated = "unknown"
	// application that created the record
	String appCreated = "unknown"
	// last date the record was updated
	Date lastUpdated
	// user who last updated the record
	String userUpdated
	
	// The final outcome of this event
	EventResult eventResult
	// The date of the final outcome
	Date eventResultDate
	// Who entered the result
	String userResultEntered
	// When was the result entered
	Date dateResultEntered

	// Default toString() conversion for EventOfInterest
	String toString() {
		String retString
		retString = eventType.toString()
		if (eventDate) {
			retString += " on " + eventDate
		}
		return retString
	}
	
	// Each EventOfInterest belongs to an EventReport
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
