package edu.umn.ncs

class EventPickOne {
	
	String name
	
	static belongsTo = [ eventType: EventType ]
	
	String toString() { name }

    static constraints = {
		name()
    }
}
