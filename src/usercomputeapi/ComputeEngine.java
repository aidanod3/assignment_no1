package usercomputeapi;

public interface ComputeEngine {

    InputSourceResponse requestInput(InputSourceRequest inputSourceRequest);

    DelimiterResponse requestDelimiter(DelimiterRequest delimiterRequest);

    OutputDestinationResponse requestOutputDestination(OutputDestinationRequest outputDestinationRequest);

    ProcessDataResponse sendData(InputSource inputSource, String delimiter, OutputDestination output);
}