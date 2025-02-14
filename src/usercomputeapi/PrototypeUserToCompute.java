package usercomputeapi;

import project.annotations.NetworkAPIPrototype;

public class PrototypeUserToCompute {

    private final ComputeEngine computeEngine;

    public PrototypeUserToCompute(ComputeEngine computeEngine) {
        this.computeEngine = computeEngine;
    }

    @NetworkAPIPrototype
    public void sendDataPrototype() {
        // Request input source
        InputSourceResponse inputSourceResponse = computeEngine.requestInput(new InputSourceRequest());

        // Request delimiter
        DelimiterResponse delimiterResponse = computeEngine.requestDelimiter(new DelimiterRequest());

        // Request output destination
        OutputDestinationResponse outputDestinationResponse = computeEngine.requestOutputDestination(new OutputDestinationRequest());

        // Send data
        computeEngine.sendData(inputSourceResponse.getInputSource(), delimiterResponse.getDelimiter(), outputDestinationResponse.getOutPutDestination());
    }
}
