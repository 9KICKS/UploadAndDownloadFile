package com.myproject.sbfileuploaddownload.repository;

import com.myproject.sbfileuploaddownload.model.FileUpload;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileUploadRepository extends JpaRepository<FileUpload, String> {
}
