FROM gitpod/workspace-full

USER gitpod

RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh && sdk install java 11.0.15.9.1-amzn && sdk default java 11.0.15.9.1-amzn && sdk install kotlin 1.7.0"