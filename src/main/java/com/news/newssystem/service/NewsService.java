package com.news.newssystem.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.news.newssystem.entity.News;

import java.util.List;


public interface NewsService extends IService<News> {
    List<News> findAll();
}
