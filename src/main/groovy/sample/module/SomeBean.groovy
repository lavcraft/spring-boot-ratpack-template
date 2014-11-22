package sample.module

import groovy.transform.CompileStatic

/**
 * Created by tolkv on 11/22/2014.
 */
@CompileStatic
class SomeBean implements Voter {
    public String vote (){
        return 'i am vote'
    }
}
