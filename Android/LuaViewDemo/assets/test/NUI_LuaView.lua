-- 测试native 调用LuaView的函数


-- 全局函数
function global_fun_test1(a, b, c)
    print("global_fun_test1 called params:", a, b, c)
    return "global_fun_test1"
end


function global_fun_test2(a, b, c)
    print("global_fun_test2 called params:", a, b, c)
    return {
        "global_fun_test2_a",
        "global_fun_test2_b"
    }
end

-- 注册window的回调函数
window.callback({
    window_fun1 = function(a, b, c)
        print("window_fun1 called params:", a, b, c)
        return "window_fun1"
    end,
    window_fun2 = function(a, b, c)
        print("window_fun2 called params:", a, b, c)
        return 2
    end
})


local title = Label()

title.text("请看后台log输出")
title.frame(0, 0, 200, 200)










