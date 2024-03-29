package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {


//在配置文件 discusspost-mapper.xml中实现方法,sql语句实现
    //返回offer-limit的贴子
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // @Param注解用于给参数取别名,
    // 如果只有一个参数,并且在<if>里使用,则必须加别名.
    //知道id返回处在的总行数，查询帖子
    int selectDiscussPostRows(@Param("userId") int userId);

    ////增加帖子
    int insertDiscussPost(DiscussPost discussPost);

    //实现查看帖子的功能，dao层，，根据id查找帖子
    DiscussPost selectDiscussPostById(int id);
    //sql实现

    //更新帖子的数量
    int updateCommentCount(int id, int commentCount);


}
