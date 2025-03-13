package com.zplus.terablog.blog.file.controller;

import com.zplus.terablog.common.base.domain.Result;
import com.zplus.terablog.blog.file.factory.UploadFileFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
@RequestMapping("/file")
public class UploadFileController {

    @PostMapping("/file/v1/upload")
    public Result uploadFile(@RequestParam(value = "file") final MultipartFile file, final HttpServletRequest request) throws IOException {

        final String store = UploadFileFactory.getUploadFileService().saveFileStore(file);
        return Result.createWithSuccessMessage().setExtra(store);
    }
}
