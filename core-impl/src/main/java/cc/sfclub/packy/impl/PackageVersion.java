package cc.sfclub.packy.impl;

import cc.sfclub.packy.api.PackageResourceMeta;
import cc.sfclub.packy.api.data.repo.IChannel;
import cc.sfclub.packy.api.pkg.IPackageResource;
import cc.sfclub.packy.api.pkg.IPackageVersion;
import cc.sfclub.packy.api.security.PackagePermission;
import com.github.zafarkhaja.semver.Version;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Builder
@Getter
public class PackageVersion implements IPackageVersion {
    private final String name;
    private final Version version;
    private final String description;
    private String repository;
    private boolean local;
    private PackagePermission requestedPermission;
    private List<String> provides;
    private List<EnvironmentRequirement> depends;
    private List<EnvironmentRequirement> conflicts;
    private Map<String, PackageResourceMeta> resources;
    private String fixer;
    private String agreement;
    private String installer;
    private String uninstaller;
    private final IChannel from;
    private final PackageType type;
    private List<EnvironmentRequirement> env;
    private List<PackageConfiguration> configurations;


    @Override
    public void setLocal(boolean y) {
        local=y;
    }

    @Override
    public Optional<IPackageResource> fetchResource(String id) {
        return Optional.empty();
    }

    @Override
    public IChannel from() {
        return from;
    }
}
