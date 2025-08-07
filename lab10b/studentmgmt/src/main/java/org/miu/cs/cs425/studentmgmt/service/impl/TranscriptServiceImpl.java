package org.miu.cs.cs425.studentmgmt.service.impl;

import org.miu.cs.cs425.studentmgmt.model.Transcript;
import org.miu.cs.cs425.studentmgmt.repository.TrancriptRepository;
import org.miu.cs.cs425.studentmgmt.service.TranscriptService;
import org.springframework.stereotype.Service;

@Service
public class TranscriptServiceImpl implements TranscriptService {
    private final TrancriptRepository trancriptRepository;

    public TranscriptServiceImpl(TrancriptRepository trancriptRepository) {
        this.trancriptRepository = trancriptRepository;
    }

    @Override
    public void saveTranscript(Transcript transcript) {
        trancriptRepository.save(transcript);
    }

    @Override
    public Transcript getTranscriptById(Long id) {
        return null;
    }
}
