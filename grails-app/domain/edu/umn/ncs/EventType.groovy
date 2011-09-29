package edu.umn.ncs

class EventType {
	// Name for this type of event
	String name

	// Flag to whether or not this event type uses a code
	Boolean useEventCode = false
	// a pretty name for the code
	String nameEventCode = "Code"

	// Flag as to whether or not this event type uses a pick one pull-down
	Boolean useEventPickOne = false
	// The name of the pull down
	String nameEventPickOne = "Pick One"

	// Flag as to whether or not this event type uses a date
	Boolean useEventDate = false
	// a pretty name for the date
	String nameEventDate = "Date"

	// Flag as to whether or not this event type uses a descriptor
	Boolean useEventDescription = false
	// a pretty name for the descriptor
	String nameEventDescription = "Describe"
	
	// date the record was created
	Date dateCreated = new Date()
	// user that created the record
	String userCreated = "unknown"
	// application that created the record
	String appCreated = "unknown"
	// date the record was last updated
	Date lastUpdated
	// user that last updated the record
	String userUpdated
	
	// the toString() method for the EventType
	String toString() { name }
	
    static constraints = {
		name()

		useEventCode()
		nameEventCode(nullable:true)

		useEventPickOne()
		nameEventPickOne(nullable:true)

		useEventDate()
		nameEventDate(nullable:true)

		useEventDescription()
		nameEventDescription(nullable:true)

		dateCreated(display:false, editable:false)
		userCreated(display:false, editable:false)
		appCreated(display:false, editable:false)
		lastUpdated(nullable:true, display:false, editable:false)
		userUpdated(nullable:true, display:false, editable:false)
    }
}
