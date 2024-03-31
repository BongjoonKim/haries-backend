package com.hariesbackend.dalle.service;

import com.hariesbackend.dalle.dto.DalleDTO;
import com.hariesbackend.dalle.dto.DalleResDTO;

import java.util.List;

public interface DalleService {
    void DalleAnswer(String question);

    List<DalleDTO> getDalleImages();

    DalleDTO getDalleIamge(String id);
}
