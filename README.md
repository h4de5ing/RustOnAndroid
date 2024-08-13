# Rust on Android

```markdown
项目根目录创建.cargo/config.toml文件,也可以在系统中创建文件C:\Users\hello\.cargo\config.toml
mkdir .cargo
touch .cargo/config.toml

[target.aarch64-linux-android]
linker = "C:/soft/Android/sdk/ndk/26.2.11394342/toolchains/llvm/prebuilt/windows-x86_64/bin/aarch64-linux-android34-clang.cmd"

[target.armv7-linux-androideabi]
linker = "C:/soft/Android/sdk/ndk/26.2.11394342/toolchains/llvm/prebuilt/windows-x86_64/bin/armv7a-linux-androideabi34-clang.cmd"

创建rust工程
cargo new hello --lib 

rustup target add aarch64-linux-android
rustup target add armv7-linux-androideabi

编译
cargo build --target aarch64-linux-android --release
cargo build --target armv7-linux-androideabi --release

mkdir "../app/src/main/jniLibs"
mkdir "../app/src/main/jniLibs/arm64-v8a"
mkdir "../app/src/main/jniLibs/armeabi-v7a"

cp target/aarch64-linux-android/debug/libhello.so ../app/src/main/jniLibs/arm64-v8a/libhello.so
cp target/armv7-linux-androideabi/debug/libhello.so ../app/src/main/jniLibs/armeabi-v7a/libhello.so

查看编译的so包是否包含新增加的方法
C:\soft\Android\ndk\arm64\bin\aarch64-linux-android-objdump.exe -T libhello.so | grep Base

```