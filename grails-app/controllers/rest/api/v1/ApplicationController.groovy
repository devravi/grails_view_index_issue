package rest.api.v1

import grails.core.GrailsApplication
import grails.plugins.*

class ApplicationController implements PluginManagerAware {

    /** The Namespace for the version of the API, see http://docs.grails.org/latest/guide/REST.html#versioningResources */
    static namespace = "v1"

    GrailsApplication grailsApplication
    GrailsPluginManager pluginManager

    def index() {
        [grailsApplication: grailsApplication, pluginManager: pluginManager]
    }
}
