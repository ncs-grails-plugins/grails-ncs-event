package edu.umn.ncs

class EventResult {
	String name
	Boolean negatesEvent = false
	
	String toString() { name }
	
    static constraints = {
		name()
		negatesEvent()
    }
}
