package edu.umn.ncs

class EventReport {
	
	// Person the Event is tied to
	Person person

	// Source Category
	EventSource eventSource
	// If source is "other", describe
	String eventSourceOther
	// Date contact was made regarding the notification of the event
	Date contactDate
	// Who completed the Event of Interest Report
	String filledOutBy
	// When was it completed
	Date filledOutDate
	// Any general comments regarding all events in this report
	String comments

	// Source of Reported Event.  Allows string, or trackedItem ID (sid)
	Source source

	// Date this record was created
	Date dateCreated = new Date()
	// Who entered this record
	String userCreated = "unknown"
	// What application created this record
	String appCreated = "unknown"
	// When was this record last updated
	Date lastUpdated
	// Who was the last user to update this record
	String userUpdated
	
	// Default toString() method for EventReport
	String toString() {
		"Events Reported ${contactDate}"
	}
	
	// This event report can be tied to more than one study,
	// and can have more than one EventOfInterest tied to it.
	static hasMany = [ studies: Study, events: EventOfInterest ]
	

	// default field constraints
    static constraints = {
		person()
		eventSource()
		eventSourceOther(nullable:true)
		contactDate()
		filledOutBy()
		filledOutDate()
		comments(nullable:true)
		source(nullable:true)

		dateCreated(display:false, editable:false)
		userCreated(display:false, editable:false)
		appCreated(display:false, editable:false)
		lastUpdated(nullable:true, display:false, editable:false)
		userUpdated(nullable:true, display:false, editable:false)
    }
}
