package indi.yangxu52.hyping.system.controller;

import indi.yangxu52.hyping.system.entity.vo.SysDeptTree;
import indi.yangxu52.hyping.system.service.SysDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yangxu52
 * @Date 2023/11/24
 */
@RestController()
@RequestMapping("/system/dept")
public class SysDeptController {

    private final SysDeptService sysDeptService;

    @Autowired
    public SysDeptController(SysDeptService sysDeptService) {
        this.sysDeptService = sysDeptService;
    }

    @GetMapping("/getDeptTree")
    public List<SysDeptTree> getDeptTree() {
        return sysDeptService.getDeptTree();
    }
}
