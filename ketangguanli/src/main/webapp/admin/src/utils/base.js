const base = {
    get() {
        return {
            url : "http://localhost:8080/ketangguanli/",
            name: "ketangguanli",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ketangguanli/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "课堂管理系统"
        } 
    }
}
export default base
