import java.security.SecureRandom;

public class TraceIdGenerator {
    private static final String HEX_CHARS = "0123456789abcdef";
    private static final int TRACE_ID_LENGTH = 20;

    public static String generateTraceId() {
        SecureRandom random = new SecureRandom();
        StringBuilder traceIdBuilder = new StringBuilder(TRACE_ID_LENGTH);

        for (int i = 0; i < TRACE_ID_LENGTH; i++) {
            traceIdBuilder.append(HEX_CHARS.charAt(random.nextInt(HEX_CHARS.length())));
        }

        return traceIdBuilder.toString();
    }

    public static void main(String[] args) {
        String traceId = generateTraceId();
        System.out.println("Generated Trace ID: " + traceId);
    }
}

