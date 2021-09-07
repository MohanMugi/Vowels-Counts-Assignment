package org.luxoft.vowelscounter.report;

import org.luxoft.vowelscounter.AverageVowels;

import java.io.IOException;
import java.util.stream.Stream;

public interface Reporter {
    void report(Stream<AverageVowels> averageVowelsStream) throws IOException;
}
