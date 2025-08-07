package org.miu.cs.cs425.studentmgmt.service;

import org.miu.cs.cs425.studentmgmt.model.Transcript;

public interface TranscriptService {
    void saveTranscript(Transcript transcript);
    Transcript getTranscriptById(Long id);
}
