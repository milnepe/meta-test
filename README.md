# meta-test

Yocto test recipe to pull sources for GitHub repo:
https://github.com/milnepe/test

## Configuration: 

Clone into sources directory adding reference to meta-test in bblayers.conf
and include in image with:

```
CORE_IMAGE_EXTRA_INSTALL += " \
	test \
"
```

## Usage:
Run from command prompt:
```
# github-test
```
sumo branch added
adding more stuff

