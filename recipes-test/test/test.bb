DESCRIPTION = "Simple helloworld application"
SECTION = "examples"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f550d452d74b7215d7fc9961aa36a88a"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "8840a256092a11d2a3c25fd90afbc6eed7319edd"
SRC_URI = "git://github.com/milnepe/test.git"

S = "${WORKDIR}/git"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/github-test.sh ${D}${bindir}/github-test.sh
}
