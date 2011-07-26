package edu.umn.ncs

import java.util.Date;

class EventType {
	String name
	Boolean useEventCode = false
	Boolean useEventPickOne = false
	Boolean useEventDate = false
	Boolean useEventDescription = false
	
	String toString() { name }
	
    static constraints = {
		name()
		useEventCode()
		useEventPickOne()
		useEventDate()
		useEventDescription()
    }
}
