package com.korea.controller;

import com.korea.dto.DTO;
import com.korea.view.Viewer;

public interface SubController
{
    boolean execute(int num, DTO dto, Viewer view);
}
