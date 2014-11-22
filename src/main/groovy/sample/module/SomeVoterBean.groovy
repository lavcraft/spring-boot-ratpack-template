package sample.module

import org.springframework.stereotype.Component

/**
 * Created by tolkv on 11/22/2014.
 */
@Component
class SomeVoterBean implements Voter {
    public SampleVote vote (){
        return new SampleVote(
                reason: 'what?!'
                ,name: 'WTF'
                ,value: 12
        )
    }
}
