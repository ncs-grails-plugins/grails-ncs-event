package edu.umn.ncs

class EventPickOne {
	
	// textual name of the "PickOne" option
	String name
	
	// Which event type does this belong to
	static belongsTo = [ eventType: EventType ]
	
	// default toString conversion
	String toString() { name }

    static constraints = {
		name()
    }
}
