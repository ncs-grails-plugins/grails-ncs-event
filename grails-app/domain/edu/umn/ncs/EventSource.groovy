package edu.umn.ncs

class EventSource {

	// The type of source for a particular event
	String name
	// flag as to whether this source is incoming or outgoing
	Boolean incoming = true
	
	// default toString() method for an EventSource
	String toString() { name }
	
    static constraints = {
		name()
		incoming()
    }
}
