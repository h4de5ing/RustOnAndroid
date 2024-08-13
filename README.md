# Rust on Android

```markdown
项目根目录创建.cargo/config文件
[target.aarch64-linux-android]
linker = "C:/soft/Android/sdk/ndk/26.2.11394342/toolchains/llvm/prebuilt/windows-x86_64/bin/aarch64-linux-android30-clang.cmd"

[target.armv7-linux-androideabi]
linker = "C:/soft/Android/sdk/ndk/26.2.11394342/toolchains/llvm/prebuilt/windows-x86_64/bin/armv7a-linux-androideabi30-clang.cmd"

创建rust工程
cargo new hello     

rustup target add aarch64-linux-android
rustup target add armv7-linux-androideabi

编译
cargo build --target aarch64-linux-android --release
cargo build --target armv7-linux-androideabi --release

```