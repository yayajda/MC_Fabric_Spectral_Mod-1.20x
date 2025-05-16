# Spectral Mod（幽冥模组）

这是一个为Minecraft 1.20.1开发的Fabric模组，添加了各种新的金属、矿石和方块。

## 模组信息

- **模组名称**: Spectral Mod
- **版本**: 0.1-1.20.1
- **Minecraft版本**: 1.20.1
- **Fabric Loader版本**: 0.15.11
- **Fabric API版本**: 0.92.2+1.20.1

## 模组内容

本模组添加了多种新的金属、矿石和方块，丰富了Minecraft的游戏体验。以下是模组中包含的主要内容：

### 新增金属

1. **银（Silver）** - 普通稀有度的金属
2. **钢（Steel）** - 较为罕见的金属，稀有度为UNCOMMON
3. **精金（Adamant）** - 普通稀有度的金属
4. **爱德曼（Edelman）** - 较为罕见的金属，稀有度为UNCOMMON
5. **秘银（Mithril）** - 较为罕见的金属，稀有度为UNCOMMON
6. **炎金（Flame Gold）** - 普通稀有度的金属
7. **钛（Titanium）** - 普通稀有度的金属
8. **深海沉银（Deep Sea Silver）** - 普通稀有度的金属

### 新增矿石和方块

1. **银块（Silver Block）** - 基于金块属性
2. **钢块（Steel Block）** - 基于铁块属性
3. **银矿（Silver Ore）** - 基于煤矿属性
4. **精金矿（Adamant Ore）** - 基于钻石矿属性，较高的挖掘难度（强度25，抗爆100）
5. **爱德曼矿（Edelman Ore）** - 基于钻石矿属性，极高的挖掘难度（强度30，抗爆100）
6. **秘银矿（Mithril Ore）** - 基于钻石矿属性，中高挖掘难度（强度15，抗爆200）
7. **秘银块（Mithril Block）** - 基于钻石块属性
8. **钛金矿（Titanium Ore）** - 基于钻石矿属性，较高的挖掘难度（强度25，抗爆100）
9. **炎金矿（Flame Gold Ore）** - 基于钻石矿属性，较高的挖掘难度（强度25，抗爆100）
10. **深海沉银矿（Deep Sea Silver Ore）** - 基于钻石矿属性，较低的挖掘难度（强度5，抗爆100）

### 矿石自然生成

本模组中的所有矿石都会在世界中自然生成，生成规则如下：

#### 主世界矿石

1. **银矿（Silver Ore）** - 在高度 -60 到 60 之间生成，每区块约生成 8 个矿脉，较为常见
2. **精金矿（Adamant Ore）** - 在高度 -80 到 0 之间生成，每区块约生成 4 个矿脉，较为稀有
3. **爱德曼矿（Edelman Ore）** - 在高度 -90 到 -20 之间生成，生成概率较低，非常稀有
4. **秘银矿（Mithril Ore）** - 在高度 -70 到 0 之间生成，每区块约生成 3 个矿脉，较为稀有
5. **钛金矿（Titanium Ore）** - 在高度 -60 到 20 之间生成，每区块约生成 5 个矿脉，中等稀有度
6. **炎金矿（Flame Gold Ore）** - 在高度 -60 到 0 之间生成，每区块约生成 4 个矿脉，较为稀有
7. **深海沉银矿（Deep Sea Silver Ore）** - 在高度 -60 到 40 之间生成，每区块约生成 6 个矿脉，中等常见度



### 矿石熔炼

本模组支持将所有矿石熔炼成对应的金属锭。每种矿石都可以通过以下两种方式熔炼：

1. **普通熔炉（Furnace）** - 标准的熔炼方式
2. **高炉（Blast Furnace）** - 更快速的熔炼方式

熔炼时间和经验值根据矿石的稀有度和难度设置：

| 矿石 | 熔炉时间 | 高炉时间 | 经验值 |
|------|----------|----------|--------|
| 银矿 | 200刻 | 100刻 | 0.7 |
| 精金矿 | 250刻 | 125刻 | 1.0 |
| 爱德曼矿 | 300刻 | 150刻 | 1.2 |
| 秘银矿 | 250刻 | 125刻 | 1.0 |
| 钛金矿 | 250刻 | 125刻 | 1.0 |
| 炎金矿 | 250刻 | 125刻 | 1.0 |
| 深海沉银矿 | 220刻 | 110刻 | 0.8 |

## 物品组

本模组添加了两个物品组来分类显示所有新增内容：

1. **幽冥材料组（Spectral Material Group）** - 包含所有新增的金属锭
2. **幽冥方块组（Spectral Block Group）** - 包含所有新增的矿石和金属块

## 项目代码结构

以下是项目的主要代码文件及其功能：

### 核心类

- `src/main/java/yaya/spectralmod/SpectralMod.java` - 模组的主类，实现ModInitializer接口，负责初始化模组中的物品、方块和物品组
- `src/main/java/yaya/spectralmod/SpectralModClient.java` - 客户端模组类，实现ClientModInitializer接口，处理客户端相关的初始化
- `src/main/java/yaya/spectralmod/SpectralModDataGenerator.java` - 数据生成器类，实现DataGeneratorEntrypoint接口，用于生成模组所需的数据文件

### 物品类

- `src/main/java/yaya/spectralmod/item/ModItems.java` - 定义并注册模组中的所有物品（主要是金属锭）
- `src/main/java/yaya/spectralmod/item/ModItemGroups.java` - 创建并注册模组的物品组，组织物品在创造模式物品栏中的显示

### 方块类

- `src/main/java/yaya/spectralmod/block/ModBlocks.java` - 定义并注册模组中的所有方块（矿石和金属块）

### 世界生成

- `src/main/java/yaya/spectralmod/world/ModConfiguredFeatures.java` - 配置矿石生成的特性
- `src/main/java/yaya/spectralmod/world/ModPlacedFeatures.java` - 配置矿石在世界中的放置位置和生成条件
- `src/main/java/yaya/spectralmod/world/ModOrePlacement.java` - 定义矿石生成的辅助方法
- `src/main/java/yaya/spectralmod/world/gen/ModOreGeneration.java` - 将矿石生成注册到生物群系中

### 数据生成

- `src/main/java/yaya/spectralmod/datagen/ModRecipeProvider.java` - 配方生成器类，生成各种矿石熔炼配方
- `src/main/java/yaya/spectralmod/datagen/ModWorldGenerator.java` - 世界生成数据生成器类
- `src/main/resources/data/spectralmod/recipes/` - 包含所有矿石熔炼配方的JSON文件

### Mixin类

- `src/main/java/yaya/spectralmod/mixin/ExampleMixin.java` - 示例Mixin类，展示如何使用Mixin注入代码到Minecraft的原始类中

### 配置文件

- `src/main/resources/fabric.mod.json` - 模组的主要配置文件，定义了模组的基本信息和入口点
- `src/main/resources/spectralmod.mixins.json` - Mixin配置文件
- `gradle.properties` - 定义模组和Minecraft版本相关的属性
- `build.gradle` - Gradle构建脚本，配置项目构建过程

## 安装方法

1. 确保已安装Minecraft 1.20.1版本
2. 下载并安装Fabric Loader 0.15.11或更高版本
3. 下载并安装Fabric API 0.92.2+1.20.1或与Minecraft 1.20.1兼容的版本
4. 将本模组的JAR文件放入Minecraft的mods文件夹中
5. 启动游戏，享受新增的内容！

## 开发环境设置

如果你想为这个模组做出贡献或在此基础上开发：

1. 克隆此仓库
2. 打开终端并导航到项目根目录
3. 运行以下命令设置开发环境：
   - Windows: `gradlew genSources`
   - Linux/macOS: `./gradlew genSources`
4. 导入项目到你喜欢的IDE (IntelliJ IDEA、Eclipse等)
5. 开始开发！

## 许可证

本项目采用MIT许可证。详情请参阅LICENSE文件。

## 作者

- yaya!

## 贡献者

- yaya!


## 联系方式

- 项目主页：[https://fabricmc.net/](https://fabricmc.net/)
- 源代码：[https://github.com/FabricMC/fabric-example-mod](https://github.com/FabricMC/fabric-example-mod)

## 未来计划

- 为新增的金属添加工具和装备
- 改进矿石生成机制
- 添加更多特殊效果和功能
- 优化材质和模型
