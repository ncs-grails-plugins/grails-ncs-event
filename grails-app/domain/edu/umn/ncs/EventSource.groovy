package edu.umn.ncs

class EventSource {
	String name
	Boolean incoming = true
	
	String toString() { name }
	
    static constraints = {
		name()
		incoming()
    }
}
