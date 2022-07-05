package kt.guide.best_practice;

public class JFluentSetter {

    // デフォルト値があり、setterを任意に呼び出すことで上書きできるようなクラス
    // Builderクラスっぽいものと考えてもらえば良いかも。
    public static class JSearchConfig {
        private String root = "";
        private String term = "";
        private boolean recursive = false;
        private boolean followSymlinks = false;

        /* 
         * getterは値返すだけなので省略...
         */

        public JSearchConfig setRoot(String root) {
            this.root = root;
            return this;
        }

        public JSearchConfig setTerm(String term) {
            this.term = term;
            return this;
        }

        public JSearchConfig setRecursive(boolean recursive) {
            this.recursive = recursive;
            return this;
        }

        public JSearchConfig setFollowSymlinks(boolean followSymlinks) {
            this.followSymlinks = followSymlinks;
            return this;
        }
    }
}