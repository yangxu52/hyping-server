package indi.yangxu52.hyping.system.controller;

import indi.yangxu52.hyping.core.entity.Result;
import indi.yangxu52.hyping.system.entity.vo.SysDeptTree;
import indi.yangxu52.hyping.system.service.SysDeptService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yangxu52
 * @Date 2023/11/24
 */
@Tag(name = "部门管理")
@RestController
@RequestMapping("/system/dept")
public class SysDeptController {

    private final SysDeptService sysDeptService;

    @Autowired
    public SysDeptController(SysDeptService sysDeptService) {
        this.sysDeptService = sysDeptService;
    }

    @Operation(summary = "获取部门树列表")
    @GetMapping("/getDeptTree")
    public Result<List<SysDeptTree>> getDeptTree() {
        return Result.success(sysDeptService.getDeptTree());
    }
}
