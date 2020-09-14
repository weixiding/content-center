package com.itmuch.contentcenter.service.impl;

import com.itmuch.contentcenter.dao.content.ShareMapper;
import com.itmuch.contentcenter.domain.dto.ShareDTO;
import com.itmuch.contentcenter.domain.entity.content.Share;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShareService {

    @Autowired
    private ShareMapper shareMapper;

    public ShareDTO findById(Integer id) {
        Share share = shareMapper.selectByPrimaryKey(id);
        ShareDTO ret = ShareDTO.builder().build();
        BeanUtils.copyProperties(share,ret);
        ret.setWxNickname("weijinhao");
        return ret;
    }

}
