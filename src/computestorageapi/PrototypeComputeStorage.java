package computestorageapi;

import usercomputeapi.InputSourceRequest;
import usercomputeapi.OutputDestinationRequest;

public class PrototypeComputeStorage {

    public void prototype(DataStore dataStore) {

        //read from user specified input
        ReadResponse readResponse = dataStore.readFromInput(new InputSourceRequest());

        //write to user specified output
        WriteResponse writeResponse = dataStore.writeToOutput(new OutputDestinationRequest());
    }

}
