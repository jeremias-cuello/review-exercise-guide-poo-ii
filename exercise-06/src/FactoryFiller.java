public class FactoryFiller {
    public static FillerArray getFiller(FillerTypes type) throws IllegalArgumentException {
        switch (type) {
            case FillerTypes.CLI:
                return new FillerArrayFromCLI();
            case FillerTypes.RANDOM:
                return new FillerArrayRandom();
            default:
                throw new IllegalArgumentException("Invalid filler type: " + type);
        }
    }
}
