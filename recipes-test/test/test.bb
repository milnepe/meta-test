DESCRIPTION = "Installs script from GitHub repo"
SECTION = "examples"
HOMEPAGE = "https://github.com/milnepe/test"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f550d452d74b7215d7fc9961aa36a88a"

# Reqired for files in meta data
#FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

# Reference specific commit
#SRCREV = "86781179d508756a4756f9ac8eec937d08d32dc8"

# Reference latest version
SRCREV = "${AUTOREV}"

# Pull using https
# SRC_URI = "git://github.com/milnepe/test.git"

#Pull using ssh (necessary for private repos)
SRC_URI = "git://git@github.com/milnepe/test.git;protocol=ssh"

S = "${WORKDIR}/git"

do_install() {
    install -d ${D}${bindir}
	# Note paths to source and destination can be different
    install -m 0755 ${S}/subdir/github-test.sh ${D}${bindir}/github-test
}
