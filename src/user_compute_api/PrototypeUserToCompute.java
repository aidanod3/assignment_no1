package user_compute_api;
public class PrototypeUserToCompute {
    public void prototype(ComputeEngine computeEngine) {

        //request input source
        InputSourceResponse inputSourceResponse = computeEngine.requestInput(new InputSourceRequest());

        //request delimiter
        DelimiterResponse delimiterResponse = computeEngine.requestDelimiter(new DelimiterRequest());

        //request output destination
        OutputDestinationResponse outputDestinationResponse = computeEngine.requestOutputDestination(new OutputDestinationRequest());

        //send data
        computeEngine.sendData(inputSourceResponse.getInputSource(),
                                  delimiterResponse.getDelimiter(),
                                  outputDestinationResponse.getOutPutDestination());

    }
}
