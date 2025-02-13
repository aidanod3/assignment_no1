package user_compute_api;

public interface ComputeEngine {

    InputSourceResponse requestInput(InputSourceRequest inputSourceRequest);

    DelimiterResponse requestDelimiter(DelimiterRequest delimiterRequest);

    OutputDestinationResponse requestOutputDestination(OutputDestinationRequest outputDestinationRequest);

    ProcessDataResponse sendData(InputSource inputSource, Delimiter delimiter, OutputDestination output);
}