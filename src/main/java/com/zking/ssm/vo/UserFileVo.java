package com.zking.ssm.vo;

import com.zking.ssm.model.UserFile;
import lombok.Data;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

@Data
@ToString
public class UserFileVo extends UserFile {
    private MultipartFile userFile;
}
