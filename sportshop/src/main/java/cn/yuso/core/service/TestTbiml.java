package cn.yuso.core.service;

import cn.yuso.core.bean.TestTable;
import cn.yuso.core.dao.TestTbDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestTbiml implements TestTbService {
    @Resource
    private TestTbDao testTbDao;

    @Override
    public void addTest(TestTable testTable) {
        testTbDao.addTest(testTable);
    }
}
