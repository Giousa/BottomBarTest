package com.giou.bottombartest.fragment;

import java.util.HashMap;

/**
 * Description:
 * Author:Giousa
 * Date:2016/12/8
 * Email:65489469@qq.com
 */
public class UserFragmentFactory {

    private static HashMap<Integer, MyBaseFragment> hashMap = new HashMap<Integer, MyBaseFragment>();
    public static MyBaseFragment createFragment(int arg0) {
        //内存中如果已经有当前根据索引生成的fragment,复用之前的fragment对象,内存中没有索引指向的fragment对象,创建
        MyBaseFragment fragment = hashMap.get(arg0);
        if(fragment!=null){
            return fragment;
        }else{
            switch (arg0) {
                case 0:
                    fragment = new UserFragment1();
                    break;
                case 1:
                    fragment = new UserFragment2();
                    break;
                case 2:
                    fragment = new UserFragment3();
                    break;
                case 3:
                    fragment = new UserFragment4();
                    break;
                case 4:
                    fragment = new UserFragment5();
                    break;
            }
            //集合将创建过的fragment,管理起来
            hashMap.put(arg0, fragment);
            return fragment;
        }
    }

}
