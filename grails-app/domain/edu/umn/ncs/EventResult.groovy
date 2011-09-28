package edu.umn.ncs

class EventResult {

	// name of the result
	String name
	// flag to invalidate the reported event
	Boolean negatesEvent = false
	
	// date this result type was created
	Date dateCreated = new Date()
	// user who created this result type
	String userCreated = "unknown"
	// application that created this result type
	String appCreated = "unknown"
	// date this result type was last updated
	Date lastUpdated
	// user who updated this result type
	String userUpdated
	
	// default toString() method for the EventResult
	String toString() { name }
	
    static constraints = {
		name()
		negatesEvent()
    }
}
