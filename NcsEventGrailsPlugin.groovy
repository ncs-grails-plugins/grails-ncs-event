class NcsEventGrailsPlugin {
    // the plugin version
    def version = "1.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3.7 > *"
    // the other plugins this plugin depends on
    def dependsOn = [ ncsPeople : "0.1 > *", ncsTracking : "0.6 > *"]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp",
			"grails-app/conf/*",
			"lib/"
    ]

    def author = "Aaron Zirbes and Aaron Timbo"
    def authorEmail = "ajz@umn.edu"
    def title = "Event Tracking"
    def description = '''\\
Handle the tracking events of interest.
Events are anything that may be of interest to the study.  These often include
births, deaths, medical events (cancer, infarts, etc...)
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/ncs-event"

}
