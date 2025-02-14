package computestorageapi;

import usercomputeapi.InputSourceRequest;
import usercomputeapi.OutputDestinationRequest;

public interface DataStore {
    ReadResponse readFromInput(InputSourceRequest inputSourceRequest);

    WriteResponse writeToOutput(OutputDestinationRequest outputDestinationRequest);
}
